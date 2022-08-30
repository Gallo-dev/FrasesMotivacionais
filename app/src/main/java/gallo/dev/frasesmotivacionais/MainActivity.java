package gallo.dev.frasesmotivacionais;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView frases;
    private Button gerarFrases;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frases = findViewById(R.id.frases);
        gerarFrases = findViewById(R.id.gerarFrases);

        getSupportActionBar().hide(); //esconder a action bar

        gerarFrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // [] significa Array (Lista)  de intens
                String[] frasesMotivacionais = {
                        "O insucesso é apenas uma oportunidade para recomeçar com mais inteligência.",
                        "O sucesso é ir de fracasso em fracasso sem perder o entusiasmo.",
                        "Nossa maior fraqueza está em desistir. O caminho mais certo de vencer é tentar mais uma vez.",
                        "O verdadeiro homem mede a sua força quando se defronta com o obstáculo.",
                        "Mesmo que algo pareça difícil, nunca desista antes de tentar.",
                        "Se for desistir, desista de ser fraco."
                };

                Random random = new Random();
                int numerosAleatorios = random.nextInt(frasesMotivacionais.length);

                frases.setText(frasesMotivacionais[numerosAleatorios]);

            }
        });

    }
}