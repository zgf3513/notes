import Vue from "vue";
import Vuex from "vuex";
Vue.use(Vuex)


const actions= {
    // 用于响应组件中的动作
    AddAction(context, payload) {
        context.commit('AddMutations', payload)
    },
    ReduceAction(context, payload) {
        context.commit('ReduceMutations', payload)
    },
    AddWhileOddAction(context, payload) {
        if (context.state.sum % 2 === 1) {
            context.commit('AddMutations', payload)
        }

    },
    AddWaitAction(context, payload) {
        setTimeout(() => {
            context.commit('AddMutations', payload)
        }, 1000);
    }
}

const getters = {
    // 用于响应组件中的计算属性
    getSum(state) {
        return state.sum * 10
    }
}

const mutations= {
    // 操作数据
    AddMutations(state, payload) {
        state.sum += payload
    },
    ReduceMutations(state, payload) {
        state.sum -= payload
    }
}

const state= {
    // 存储数据
    sum: 0,

}


// 创建并暴露store
export default new Vuex.Store({
    actions: actions,
    mutations: mutations,
    state: state,
    getters: getters,
})