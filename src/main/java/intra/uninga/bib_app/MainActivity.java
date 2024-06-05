package intra.uninga.bib_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Referenciar os elementos do layout activity_main.xml
        EditText editTextTitulo = findViewById(R.id.editTextTitulo);
        EditText editTextAutor = findViewById(R.id.editTextAutor);
        EditText editTextEditora = findViewById(R.id.editTextEditora);
        Button buttonSalvar = findViewById(R.id.buttonSalvar);

        // Adicionar um ouvinte de clique ao botão "Salvar"
        buttonSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aqui você pode adicionar a lógica para salvar os dados inseridos nos EditTexts
                String titulo = editTextTitulo.getText().toString();
                String autor = editTextAutor.getText().toString();
                String editora = editTextEditora.getText().toString();

                // Por enquanto, apenas exiba os dados inseridos no logcat para teste
                // Você pode substituir isso pela lógica real de salvamento
                System.out.println("Título: " + titulo);
                System.out.println("Autor: " + autor);
                System.out.println("Editora: " + editora);
            }
        });
    }
}