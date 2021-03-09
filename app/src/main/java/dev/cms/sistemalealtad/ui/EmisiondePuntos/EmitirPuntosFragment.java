package dev.cms.sistemalealtad.ui.EmisiondePuntos;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import dev.cms.sistemalealtad.R;

public class EmitirPuntosFragment extends Fragment {

    private EmitirPuntosViewModel mViewModel;

    public static EmitirPuntosFragment newInstance() {
        return new EmitirPuntosFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.emitir_puntos_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(EmitirPuntosViewModel.class);
        // TODO: Use the ViewModel
    }

}