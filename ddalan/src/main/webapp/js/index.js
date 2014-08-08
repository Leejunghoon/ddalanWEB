$().ready(function(){
			jsChange();
		});
		
		var jsMoveUrl = function(url) {
			location.href = url;
		};
		
		
		var jsChange = function() {
			
			var cnt = 1;
			
			if(cnt == 1){
				$("#logo"+cnt).removeClass('none');
				$("#info"+cnt).removeClass("none");
				$("#status"+cnt).removeClass("none");
				cnt++;
			}
			setInterval(loopChange,2000);
			
			function loopChange() {
				if(cnt == 6) {
					cnt = 1;
					$("#logo"+(cnt+4)).addClass("none");
					$("#logo"+cnt).removeClass("none");
					$("#info"+(cnt+4)).addClass("none");
					$("#info"+cnt).removeClass("none");
					$("#status"+(cnt+4)).addClass("none");
					$("#status"+cnt).removeClass("none");
				} else {
					$("#logo"+cnt).removeClass("none");
					$("#logo"+(cnt-1)).addClass("none");
					$("#info"+cnt).removeClass("none");
					$("#info"+(cnt-1)).addClass("none");
					$("#status"+cnt).removeClass("none");
					$("#status"+(cnt-1)).addClass("none");
				}
				cnt++;
			}
		};
				