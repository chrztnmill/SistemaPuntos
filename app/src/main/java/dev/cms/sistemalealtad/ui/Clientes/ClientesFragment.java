package dev.cms.sistemalealtad.ui.Clientes;

import androidx.lifecycle.ViewModelProviders;
// probando el github
import android.os.Bundle;
// probando el github desde la nube en github
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import dev.cms.sistemalealtad.R;

public class ClientesFragment extends Fragment {

    private ClientesViewModel mViewModel;

    public static ClientesFragment newInstance() {
        return new ClientesFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.clientes_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(ClientesViewModel.class);
        // TODO: Use the ViewModel
    }

}
