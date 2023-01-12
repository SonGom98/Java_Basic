//fadeIn()
//fadeOut()
//fadeTooggle()

$('.show-btn').click(function(){
    $('div').fadeIn(500);
});

$('.hide-btn').click(function(){
    $('div').fadeOut(1000);
});

$('.toggle-btn').click(function(){
    $('div').fadeToggle(500);
});