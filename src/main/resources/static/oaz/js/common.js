/**
 * 公告样式
 */

var baseUrl = "http://oa.sdsoon.cn:8099/";
var baseUrlImg = "http://oa.sdsoon.cn:8099/images/";

/*禁止浏览器选中*/
document.body.onselectstart = function () { 
    return false; 
};

$(function(){
	$(".aioa-left-ul li").click(function(){
		console.log(123);
		$(this).addClass('action').siblings().removeClass('action')
	})
})


