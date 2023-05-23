package com.staytonight.finalandrod.ui.news

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.staytonight.domain.model.Article
import com.staytonight.domain.usecase.GetNewsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class NewsViewModel @Inject constructor(private val getNewsUseCase: GetNewsUseCase) : ViewModel() {

    private val _state = MutableLiveData<List<Article>>()
    val state: LiveData<List<Article>> = _state

    fun onInitNews() {
        viewModelScope.launch {
            val response = getNewsUseCase.getNews()
            _state.value = response
        }
    }
}