/**
 * 所有 jsp:include 的 button jsp 
 * 需要使用的 javascript function
 */
$(function() {
	
	$('button[name="form_reset"]').click(function(){
		var temp_form = $(this).closest("form");
		$(temp_form).find('input').val('');
	});
	
})