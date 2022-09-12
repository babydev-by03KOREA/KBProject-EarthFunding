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
        if ($("#nickName").val() === "") {
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
})

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
    // let emailChkArea = document.querySelector('.mail_check_input_box');

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

/* 인증번호 비교
* $(document).on("click", "#emailSend" ,function() { */

$("#mail_check_input").blur(function () {

    const inputCode = $("#mail_check_input").val();        // 입력코드
    const $checkResult = $("#mail_check_warn");    // 비교 결과

    if (inputCode === code) {                            // 일치할 경우
        $checkResult.html("인증번호가 일치합니다.");
        $checkResult.css('color', 'green');
        $('#emailSend').attr('disabled', true);
        $('#email__form').attr('readonly', true);
    } else {                                            // 일치하지 않을 경우
        $checkResult.html("인증번호를 다시 확인해주세요.");
        $checkResult.css('color', 'red');
    }
});


