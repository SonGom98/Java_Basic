$('div').css({'display' : 'none'});

$('.btn').mouseenter(function(){
    $('div').show();
});

$('.btn').mouseleave(function(){
    $('div').hide();
});