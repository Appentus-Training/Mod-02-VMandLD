package appentus.training.ldandvm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ProjectViewModelFactory(private val type : Int,private val value : Int) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(type == 0){
            return MainActivityViewModel(value) as T
        }else{
            return MainActivityViewModel2(value) as T
        }
    }
}