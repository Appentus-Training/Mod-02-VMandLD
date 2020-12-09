package appentus.training.ldandvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
/**
 * 1. ViewModel
 * 2. AndroidViewModel(application context available and it is viewmodel sub class)
 *
 * Factory Design Pattern
 * 1. ViewModelProvider.Factory
 *
 * LiveData
 * 1. RxJava Observable small version ()
 * 2. Pro : LifeCycleAware
 * 3. Syn and asyn
 * */
class MainActivityViewModel2(private val i : Int) : ViewModel() {

    private var count = MutableLiveData<Int>()
    val countData : LiveData<Int>
    get() = count

    init {
        count.value = 0
    }

    fun updateCount(){
        count.value = (count.value)?.plus(1)
    }
}