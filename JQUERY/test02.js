/*
    $('선택자').함수(function(){
        실행구문;
    })
*/

$('p').css({'display' : 'none'})

$('.show-btn').click(function(){
    $('p').css({'display':'block'});
})

$('.hide-btn').click(function(){
    $('p').css({'display':'none'});
})