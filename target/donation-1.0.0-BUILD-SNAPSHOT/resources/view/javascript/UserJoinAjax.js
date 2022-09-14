$(document).ready(function () {
    // 취소
    $(".cancel").on("click", function () {
        location.href = "/index.do";
    })

    $("#submit").on("click", function () {
        if ($("#userid").val() === "") {
            alert("아이디를 입력해주세요.");
            $("#userid").focus();
            return false;
        }
        if ($("#passwd").val() === "") {
            alert("비밀번호를 입력해주세요.");
            $("#userPass").focus();
            return false;
        }
        if ($("#email__form").val() === "") {
            alert("닉네임을 입력해주세요.");
            $("#nickName").focus();
            return false;
        }

        let idChkVal = $("#idOverLab").val();

        if (idChkVal === "N") {
            alert("중복확인 버튼을 눌러주세요.");
        } else if (idChkVal === "Y") {
            $("#regForm").submit();
        }

    });
});

$(document).ready(function(){
    $('.join__pwd__form i').on('click',function(){
        $('input').toggleClass('active');
        if($('input').hasClass('active')){
            $(this).attr('class',"fa fa-eye-slash fa-lg")
                .prev('input').attr('type',"text");
        }else{
            $(this).attr('class',"fa fa-eye fa-lg")
                .prev('input').attr('type','password');
        }
    });
});

function idOverLap() {
    $.ajax({
        url: "/member/idCheck.do",
        type: "post",
        dataType: "json",
        data: {"userid": $("#userid").val()},
        success: function (data) {
            let check = /[ㄱ-ㅎ|ㅏ-ㅣ|가-힣]/;
            if (data === 1) {
                alert("중복된 아이디입니다.");
            } else if ($("#userid").val() === "") {
                alert("아이디를 입력해주세요.");
            } else if (check.test($("#userid").val())) {
                alert("아이디는 영어만 가능해요ㅠㅠ");
            } else if (data === 0) {
                $("#idOverLab").attr("value", "Y");
                alert("사용가능한 아이디입니다.");
            }
        }
    });
}

/* 인증번호 이메일 전송 */
$(document).on("click", "#emailSend", function () {

    //  이메일 입력란
    const email = $('#email__form').val();
    //  인증번호 입력란    input type 어쩌고
    const emailChkNum = $('.mail_check_input');
    //  인증번호 입력란 박스

    alert("입력하신 이메일로 인증번호를 보냈어요! >>" + email);

    if (email === '') {
        alert('이메일을 입력해주세요!');
    }

    $.ajax({

        type: "GET",
        url: "/member/emailCheck.do?email=" + email,
        success: function (data) {
            // console.log("data : " + data);
            emailChkNum.attr("disabled", false);
            code = data;
            alert('인증번호가 전송되었습니다.');
        }

    });

});

function emailCheck() {
    let inputCode = document.getElementById('mail_check_input').value;

    if (inputCode === '') {
        alert('');
    }

    if (inputCode === code) {
        alert("Email 인증에 성공하였습니다!");
        return true;
    } else {
        alert("Email 인증에 실패하였습니다. 인증번호를 다시 확인해주세요!");
        return false;
    }
}

