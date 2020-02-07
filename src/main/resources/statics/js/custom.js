$(document).ready(function(){

	$(".monthwise").toggle();
	$(".datewise").toggle();
	$(".yearwise").toggle();
});

$(document).ready(function(){
	$("#resetid").click(function(){
		$(".monthwise").hide();
		$(".yearwise").hide();
		$(".datewise").hide();


	});
});

$(document).ready(function(){
	$("#Radios1").click(function(){
		$(".monthwise").show();
		$(".yearwise").hide();
		$(".datewise").hide();

	});
});

$(document).ready(function(){
	$("#Radios2").click(function(){
		$(".monthwise").hide();
		$(".yearwise").show();
		$(".datewise").hide();

	});
});

$(document).ready(function(){
	$("#Radios3").click(function(){
		$(".monthwise").hide();
		$(".yearwise").hide();
		$(".datewise").show();

	});
});






