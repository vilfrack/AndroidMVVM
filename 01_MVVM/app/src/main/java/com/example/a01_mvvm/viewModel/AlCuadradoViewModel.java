package com.example.a01_mvvm.viewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.a01_mvvm.useCase.AlCuadradoUseCase;

public class AlCuadradoViewModel extends ViewModel {

    private MutableLiveData<String> resultado;

    public AlCuadradoViewModel() {
        resultado = new MutableLiveData<>();
    }

    public LiveData<String> getResultado() {
        return resultado;
    }

    public void alCuadrado(String data) {
        resultado.setValue(AlCuadradoUseCase.alCuadrado(data));
    }
}
