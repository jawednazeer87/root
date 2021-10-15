<blockquote class="blockquote">
  <p class="mb-0">Upload Documents.</p>
</blockquote>

<form method="POST" action="/teacher/document/upload" enctype="multipart/form-data">
    <input type="file" name="file" /><br/><br/>
    <input type="submit" value="Submit" />
</form>

<div>
	<object id="pdfUrl" width="100%" height="500px" />
</div>

<script>
	$(document).ready(function(){
		
		
		var doc = "<%= request.getAttribute("documentsDTO") %>";
		console.log("doc: "+(doc==="null"));
		console.log("doc: "+(doc=="null"));
		console.log("doc: "+(doc==null))
		console.log("doc: "+doc.length);
		console.log("doc: "+!doc);
		
		if(!(doc==="null" || doc==null)){
			
			setTimeout(
					function() {
						
						$.ajax({
							async : false,
							global : false,
							type : "GET",
							url : "/teacher/document/download",
							success : function(data) {
								debugger;
								var doc = data;
								var srcObj = 'data:' + doc.type	+ ';base64,' + doc.contents;
								var	mimeType = doc.type;
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
		else{
			console.log("else");
		}
			
		
	});
</script>