import * as type from '../type.js'
const state = {
    showSidebar: false,
    searchHistory: [],
}
const mutations = {
    [type.COM_SHOW_SIDE_BAR](state, status){
        state.showSidebar = status;
    },
    [type.COM_HIDE_SIDE_BAR](state, status){
        state.showSidebar = status;
    },
    [type.COM_DELETE_SEARCH_HISTORY](state, index){
        state.searchHistory.splice(index, 1)
    },
    [type.COM_CLEAR_SEARCH_HISTORY](state){
        state.searchHistory = []
    },
    [type.COM_SAVE_SEARCH_HISTORY](state, payload){
        state.searchHistory = payload
    }
}
const actions = {
    // setShowSidebar(context, status){
    //     context.commit(type.COM_SHOW_SIDE_BAR, status)
    // }
    setShowSidebar({commit}, status){
        // console.log(13);
        commit(type.COM_SHOW_SIDE_BAR, status)
    },
    setHideSidebar({commit}, status){
        // console.log(13);
        commit(type.COM_HIDE_SIDE_BAR, status)
    },
    deleteSearchHistory({commit}, index){
        commit(type.COM_DELETE_SEARCH_HISTORY, index)
    },
    clearSearchHistory({commit}){
        commit(type.COM_CLEAR_SEARCH_HISTORY)
    },
    saveSearchHistory({commit, state}, query){
        let searchHistory = [query, ...state.searchHistory.slice()]
        searchHistory = [...new Set(searchHistory)]
        console.log(state.searchHistory);
        commit(type.COM_SAVE_SEARCH_HISTORY, searchHistory)
    }

}

const getters = {
    showSidebar: state => state.showSidebar,
    searchHistory: state => state.searchHistory
}

export default {
    state, mutations, actions, getters
}