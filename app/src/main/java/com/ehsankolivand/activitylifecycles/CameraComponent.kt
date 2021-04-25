package com.ehsankolivand.activitylifecycles

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.OnLifecycleEvent

class CameraComponent: LifecycleEventObserver {


    override fun onStateChanged(source: LifecycleOwner, event: Lifecycle.Event) {
        TODO("Not yet implemented")
    }


    
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun initializeCamera(){
        // do something
    }
}