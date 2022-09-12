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
function mailCheck() {
    const email = document.getElementById('email__form').value;
    alert(email);
    $.ajax({

        type: "GET",
        url: "/member/emailCheck.do?email=" + email

    });
}
