package custodio.juancarlos.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var zero: Button = findViewById(R.id.btn0)
    var one: Button = findViewById(R.id.btn1)
    var two: Button = findViewById(R.id.btn2)
    var three: Button = findViewById(R.id.btn3)
    var four: Button = findViewById(R.id.btn4)
    var five: Button = findViewById(R.id.btn5)
    var six: Button = findViewById(R.id.btn6)
    var seven: Button = findViewById(R.id.btn7)
    var eight: Button = findViewById(R.id.btn8)
    var nine: Button = findViewById(R.id.btn9)
    var clear: Button = findViewById(R.id.btnClear)
    var result: Button = findViewById(R.id.btnResult)
    var plus: Button = findViewById(R.id.btnPlus)
    var minus: Button = findViewById(R.id.btnMinus)
    var mult: Button = findViewById(R.id.btnMult)
    var div: Button = findViewById(R.id.btnDiv)
    var view1: TextView = findViewById(R.id.view2)
    var view2: TextView = findViewById(R.id.view1)
    var resultado: TextView = findViewById(R.id.resultado)
    var flag: Int = 1
    var operacion:String = ""
    var num1: Int = 0
    var num2: Int = 0
    var res: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        zero.setOnClickListener {
            if (flag == 1) {
                if (view1 != null) {
                    var temp: String = view1.text.toString()
                    var num: String = temp + "0"
                    view1.setText(num)
                } else {
                    view1.setText("0")
                }
            } else if (flag == 2) {
                if (view2 != null) {
                    var temp: String = view2.text.toString()
                    var num: String = temp + "0"
                    view2.setText(num)
                } else {
                    view2.setText("0")
                }
            }
        }

        one.setOnClickListener {
            if (flag == 1) {
                if (view1.text != null) {
                    var temp: String = view1.text.toString()
                    var num: String = temp + "1"
                    view1.setText(num)
                } else {
                    view1.setText("1")
                }
            } else if (flag == 2) {
                if (view2 != null) {
                    var temp: String = view2.text.toString()
                    var num: String = temp + "1"
                    view2.setText(num)
                } else {
                    view2.setText("1")
                }
            }
        }

        two.setOnClickListener {
            if (flag == 1) {
                if (view1.text != null) {
                    var temp: String = view1.text.toString()
                    var num: String = temp + "2"
                    view1.setText(num)
                } else {
                    view1.setText("2")
                }
            } else if (flag == 2) {
                if (view2 != null) {
                    var temp: String = view2.text.toString()
                    var num: String = temp + "2"
                    view2.setText(num)
                } else {
                    view2.setText("2")
                }
            }
        }

        three.setOnClickListener {
            if (flag == 1) {
                if (view1.text != null) {
                    var temp: String = view1.text.toString()
                    var num: String = temp + "3"
                    view1.setText(num)
                } else {
                    view1.setText("3")
                }
            } else if (flag == 2) {
                if (view2 != null) {
                    var temp: String = view2.text.toString()
                    var num: String = temp + "3"
                    view2.setText(num)
                } else {
                    view2.setText("3")
                }
            }
        }

        four.setOnClickListener {
            if (flag == 1) {
                if (view1.text != null) {
                    var temp: String = view1.text.toString()
                    var num: String = temp + "4"
                    view1.setText(num)
                } else {
                    view1.setText("4")
                }
            }
        }

        five.setOnClickListener {
            if (flag == 1) {
                if (view1.text != null) {
                    var temp: String = view1.text.toString()
                    var num: String = temp + "5"
                    view1.setText(num)
                } else {
                    view1.setText("5")
                }
            } else if (flag == 2) {
                if (view2 != null) {
                    var temp: String = view2.text.toString()
                    var num: String = temp + "5"
                    view2.setText(num)
                } else {
                    view2.setText("5")
                }
            }
        }

        six.setOnClickListener {
            if (flag == 1) {
                if (view1.text != null) {
                    var temp: String = view1.text.toString()
                    var num: String = temp + "6"
                    view1.setText(num)
                } else {
                    view1.setText("6")
                }
            } else if (flag == 2) {
                if (view2 != null) {
                    var temp: String = view2.text.toString()
                    var num: String = temp + "6"
                    view2.setText(num)
                } else {
                    view2.setText("6")
                }
            }
        }

        seven.setOnClickListener {
            if (flag == 1) {
                if (view1.text != null) {
                    var temp: String = view1.text.toString()
                    var num: String = temp + "7"
                    view1.setText(num)
                } else {
                    view1.setText("7")
                }
            } else if (flag == 2) {
                if (view2 != null) {
                    var temp: String = view2.text.toString()
                    var num: String = temp + "7"
                    view2.setText(num)
                } else {
                    view2.setText("7")
                }
            }
        }

        eight.setOnClickListener {
            if (flag == 1) {
                if (view1.text != null) {
                    var temp: String = view1.text.toString()
                    var num: String = temp + "8"
                    view1.setText(num)
                } else {
                    view1.setText("8")
                }
            } else if (flag == 2) {
                if (view2 != null) {
                    var temp: String = view2.text.toString()
                    var num: String = temp + "8"
                    view2.setText(num)
                } else {
                    view2.setText("8")
                }
            }
        }

        nine.setOnClickListener {
            if (flag == 1) {
                if (view1.text != null) {
                    var temp: String = view1.text.toString()
                    var num: String = temp + "9"
                    view1.setText(num)
                } else {
                    view1.setText("9")
                }
            } else if (flag == 2) {
                if (view2 != null) {
                    var temp: String = view2.text.toString()
                    var num: String = temp + "9"
                    view2.setText(num)
                } else {
                    view2.setText("9")
                }
            }
        }

        clear.setOnClickListener{
            view1.setText(" ")
        }

        plus.setOnClickListener{
            var temp = view1.text.toString()
            num1 = temp.toInt()
            view1.setText(temp+"+")
            operacion = "plus"
            flag = 2
        }

        minus.setOnClickListener{
            var temp = view1.text.toString()
            num1 = temp.toInt()
            view1.setText(temp+"-")
            operacion = "minus"
            flag = 2
        }

        mult.setOnClickListener{
            var temp = view1.text.toString()
            num1 = temp.toInt()
            view1.setText(temp+"*")
            operacion = "mult"
            flag = 2
        }

        plus.setOnClickListener{
            var temp = view1.text.toString()
            num1 = temp.toInt()
            view1.setText(temp+"/")
            operacion = "div"
            flag = 2
        }

        result.setOnClickListener{
            num2 = view2.text.toString().toInt()

            if (operacion.equals("plus")){
                res = num1 + num2
            } else if (operacion.equals("minus")){
                res = num1 - num2
            } else if (operacion.equals("mult")){
                res = num1 * num2
            } else if (operacion.equals("div")){
                res = num1 / num2
            }
            resultado.setText(res)

            resetValues()
        }

    }

    fun resetValues(){
        flag = 1
        operacion = ""
        num1 = 0
        num2 = 0
        res = 0
    }
}