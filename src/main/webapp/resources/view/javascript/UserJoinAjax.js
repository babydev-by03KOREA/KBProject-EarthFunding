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
            if (data === 1) {
                alert("중복된 아이디입니다.");
            } else if (data === 0) {
                $("#idOverLab").attr("value", "Y");
                alert("사용가능한 아이디입니다.");
            }
        }
    })

}
