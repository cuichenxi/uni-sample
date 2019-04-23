
      !(function(){
        var uniAppViewReadyCallback = function(){
          setCssToHead([[2,1],"body,wx-view{display:-webkit-box;display:-webkit-flex;display:flex}\nbody{min-height:100%;background-color:#fff}\nwx-image{max-width:",[0,300],";height:",[0,300],";border-radius:50%}\n.",[1],"about,.",[1],"content{-webkit-box-orient:vertical;-webkit-box-direction:normal;-webkit-flex-direction:column;flex-direction:column;-webkit-box-flex:1;-webkit-flex:1;flex:1}\n.",[1],"content{padding:",[0,30],"}\n.",[1],"desc{margin-top:",[0,30],";display:block;text-align:center}\n.",[1],"code{color:#e96900;background-color:#f8f8f8}\n.",[1],"_button{width:100%;margin-top:",[0,40],"}\n.",[1],"version{height:",[0,80],";line-height:",[0,80],";-webkit-box-pack:center;-webkit-justify-content:center;justify-content:center;color:#ccc}\n.",[1],"webname{display:block;text-align:center;margin-top:",[0,60],"}\n",],undefined,{path:"./pages/tool/about.wxss"})();
document.dispatchEvent(new CustomEvent("generateFuncReady", { detail: { generateFunc: $gwx('./pages/tool/about.wxml') } }));
        }
        if(window.__uniAppViewReady__){
          uniAppViewReadyCallback()
        }else{
          document.addEventListener('uniAppViewReady',uniAppViewReadyCallback)
        }
      })();
      