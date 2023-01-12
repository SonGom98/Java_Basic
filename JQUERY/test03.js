/*
    $('선택자1').함수(function(){
        $('선택자2').메소드();
    })
*/

$('div').css({'display' : 'none'});

$('.show-btn').click(function(){
    $('div').show();
});

$('.hide-btn').click(function(){
    $('div').hide();
});

/*
    선택자 종류
    -css 태그 선택자
    -css 클래스 선택자(.)
    -css id 선택자(#)
    -this

    필수 함수
    -click
    -mouseenter
    -mouseleave

    필수 메소드
    show()
    hide()
    slideDown()
    slideUp()
    fadeIn()
    fadeOut()

    addClass()
    removeClass()

    children()
    siblings()

*/