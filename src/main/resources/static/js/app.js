(function($) {
  'use strict';

  $(function() {
    var $fullText = $('.admin-fullText');
    $('#admin-fullscreen').on('click', function() {
      $.AMUI.fullscreen.toggle();
    });

    $(document).on($.AMUI.fullscreen.raw.fullscreenchange, function() {
      $fullText.text($.AMUI.fullscreen.isFullscreen ? '退出全屏' : '开启全屏');
    });


    var getWindowHeight = $(window).height(),
        myappLoginBg    = $('.myapp-login-bg');
    myappLoginBg.css('min-height',getWindowHeight + 'px');
    (function () { 
      console.log('start1');
      $.ajax({url:'/college/list',context:$('#academy'),success:function (msg) {
        console.log(msg);
      }})
      
    })();
    (function () { 
      console.log('start2');
      $('#submit').click(function () {
        if(!$('#submitText').val()){
          alert("请填写内容哦")
        }
        else if(!$('#submitId').val()){
          alert("请署名哦")
        }
        else{
          console.log("sunccess!");
        }
      })
    })();
    (function () {
    
    })()

  });

})(jQuery);
