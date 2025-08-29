package ndk.sample

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import ndk.sample.databinding.ActivityMainBinding
import ndk.sample.ndk_util.MathNdkLib

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        binding.buttonCalculate.setOnClickListener {
            calculateButtonClick()
        }
    }

    @SuppressLint("SetTextI18n")
    fun calculateButtonClick() {
        var result: String
        try {
            val num1 = binding.editTextNumber1.text.toString().toInt()
            val num2 = binding.editTextNumber2.text.toString().toInt()
            val radioButtonCheckedId = binding.radioGroupOperations.checkedRadioButtonId
            when (radioButtonCheckedId) {
                binding.radioButtonAdd.id -> {
                    result = MathNdkLib().add(num1, num2).toString()
                }

                binding.radioButtonSubtract.id -> {
                    result = MathNdkLib().subtract(num1, num2).toString()
                }

                binding.radioButtonMultiply.id -> {
                    result = MathNdkLib().multiply(num1, num2).toString()
                }

                binding.radioButtonDivide.id -> {
                    result = MathNdkLib().divide(num1, num2).toString()
                }

                else -> {
                    result = "error"
                }
            }
        } catch (e: Exception) {
            result = "error"
        }
        binding.textViewAnswer.text = "Result: $result"
    }
}