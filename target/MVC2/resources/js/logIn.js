/* 로그인 화면의 기능들을 정의해 놓은 Javascript 파일 */

function clickControl() {
    $(".sgnBtn").click(function(){
        let targetId = this.getAttribute("id");
        alert("clickControl is working!! 동적 반영 되냐!????\r\n" +
            targetId +" 버튼 울린다!1111222");

        if(targetId == "signUpBtn"){
            window.location.href="signup";
        }
    });
}