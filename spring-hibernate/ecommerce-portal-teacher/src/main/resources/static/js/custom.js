
console.log("hello custom js");

function documentPopup(inputUrl) {
	
	setTimeout(
			function() {
				
				$.ajax({
							async : false,
							global : false,
							type : "GET",
							url : inputUrl,
							success : function(data) {
								var doc = data;
								var srcObj = 'data:' + doc.mimeType	+ ';base64,' + doc.content;
								var	mimeType = doc.mimeType;
								var	fileName = doc.name;
								var object = '<object id="pdfUrl" width="100%" height="500px"'
									+ ' data="'
									+ srcObj
									+ '" '
									+ ' type="'
									+ mimeType
									+ '" >'
									+ '<embed '
									+ '  src="'
									+ srcObj
									+ '" '
									+ '  type="'
									+ mimeType
									+ '" '
									+ '  width="100%" '
									+ '  height="500px" />'
									+ '</object>';
								$("#pdfUrl").replaceWith(object);
							},
							error: function (e) {
								console.log("error: "+e);
							}
						}).done(function() {
							console.log("done");
						});
			}, 1000);
}
