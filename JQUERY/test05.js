//show() hide()
//slideDown() slideUp() slideToggle()

$('.show-btn').click(function(){
    $('div').slideDown();
});

$('.hide-btn').click(function(){
    $('div').slideUp();
});

$('.toggle-btn').click(function(){
    $('div').slideToggle();
});