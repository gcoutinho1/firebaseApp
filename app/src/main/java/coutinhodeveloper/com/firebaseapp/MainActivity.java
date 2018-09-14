package coutinhodeveloper.com.firebaseapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends Activity {

    private DatabaseReference firebaseReferencia = FirebaseDatabase.getInstance().getReference();
    private DatabaseReference usuarioReferencia = firebaseReferencia.child("Usuarios");
    private DatabaseReference produtosReferencia = firebaseReferencia.child("Produtos");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Produtos produtos = new Produtos();
        produtos.setDescricaoProduto("iphone");
        produtos.setCorProduto("Preto");
        produtos.setFabricanteProduto("Apple");

        produtosReferencia.child("001").setValue(produtos); */

        produtosReferencia.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Log.i("FIREBASE",dataSnapshot.getValue().toString() );

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }
}
