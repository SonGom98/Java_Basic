/*
    $('선택자1').이벤트발생함수)(function(){     //선택자1에 어떤 조치를 취했을 때 예) click, mouseenter, mouseleave
        $('선택자2').메소드();                  //선택자2에 효과 발생 예) fadeIn, faeOut, 기타 css스타일
    });
*/

$('button').click(function(){
    $('p').css('color','red');
});