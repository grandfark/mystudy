/** youtube.js */

//youtube IFrame API를 비동기로 로드한다.
var tag = document.createElement('script');

tag.src = "https://www.youtube.com/iframe_api";
var firstScriptTag = document.getElementsByTagName('script')[0];
firstScriptTag.parentNode.insertBefore(tag, firstScriptTag);

// 3. This function creates an <iframe> (and YouTube player)
//    after the API code downloads.
function onYouTubeIframeAPIReady() {
	new YT.Player('player', {
		videoId: 'NBIw_-c5su0',// 시작 영상
		playerVars:{
			autoplay:true,
			loop:true,
			playlist:'NBIw_-c5su0'//반복할 영상
		},
		events: {
			onReady:function(e){
				e.tarrget.mute()//음소거
			}
		}
	});
}



