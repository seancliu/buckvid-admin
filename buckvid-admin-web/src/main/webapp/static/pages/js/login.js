var Login = function() {

	// initialize login instance
    var handleLogin = function() {

    	// jquery-form-validate front-end
        $('.login-form').validate({
            errorElement: 'span', //default input error message container
            errorClass: 'help-block', // default input error message class
            focusInvalid: false, // do not focus the last invalid input
            rules: {
                username: {
                    required: true
                },
                password: {
                    required: true
                }
            },

            messages: {
                username: {
                    required: "Username is required."
                },
                password: {
                    required: "Password is required."
                }
            },

            highlight: function(element) { // highlight error inputs
                $(element).closest('.form-group').addClass('has-error'); // set error class to the control group
            },

            success: function(label) {
                label.closest('.form-group').removeClass('has-error');
                label.remove();
            },

            errorPlacement: function(error, element) {
                error.insertAfter(element.closest('#input-error'));
            },

            submitHandler: function(form) {
            	
            	var loginForm = $('.login-form');
            	var hdnContextPath = $("#hdnContextPath").val();
            	loginForm.ajaxSubmit({
            		dataType: "json",
                    type: "post", //  get/post
                    url: hdnContextPath + '/users/login.action', // url to submit
                    data: loginForm.serialize(),
                    success: function(data) {
                        // Notice msg
                        if (data.status == 200 && data.msg == "OK") {
                        	window.location.href = hdnContextPath + "/center.action";
                        } else {
//                        	SweetAlert.error(data.msg);
                        	alert(data.msg);
                        }
                    }
                });
            	
            }
        });

    }
    
    return {
        init: function() {
            handleLogin();
        }

    };

}();

jQuery(document).ready(function() {
    Login.init();
});