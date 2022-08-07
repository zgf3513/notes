import {onBeforeUnmount, onMounted, reactive} from "vue";

export default function(){
    let pos = reactive({
        x: 0,
        y: 0
    })

    function savePos(event){
        pos.x = event.pageX
        pos.y = event.pageY
    }
    onMounted(()=>{
        window.addEventListener('click',savePos)
    })

    onBeforeUnmount(() =>　{
        window.removeEventListener('click',savePos)
    })

    return pos
}