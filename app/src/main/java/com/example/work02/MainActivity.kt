package com.example.work02
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.work02.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ComputerNetwork:EditText = findViewById(R.id.ComputerNetwork)
        val Badminton:EditText = findViewById(R.id.Badminton)
        val BusinessLaw :EditText = findViewById(R.id.BusinessLaw)
        val InformationSystem :EditText = findViewById(R.id.InformationSystem)
        val Opensoure :EditText = findViewById(R.id.Opensoure)
        val Credit1 :EditText = findViewById(R.id.Credit1)
        val Credit2 :EditText = findViewById(R.id.Credit2)
        val Credit3 :EditText = findViewById(R.id.Credit3)
        val Credit4 :EditText = findViewById(R.id.Credit4)
        val Credit5 :EditText = findViewById(R.id.Credit5)
        val Point1 :EditText = findViewById(R.id.Point1)
        val Point2 :EditText = findViewById(R.id.Point2)
        val Point3 :EditText = findViewById(R.id.Point3)
        val Point4:EditText = findViewById(R.id.Point4)
        val Point5:EditText = findViewById(R.id.Point5)
        val OK: Button = findViewById(R.id.OK)
        val Cancel: Button = findViewById(R.id.Cancel)
        val run:TextView = findViewById(R.id.run)
        val runn:TextView = findViewById(R.id.runn)

        OK.setOnClickListener{
            var ComputerNetwork = ComputerNetwork.text.toString()
            var Credit1 = Credit1.text.toString()
            var Point1 = Point1.text.toString()

            var Badminton = Badminton.text.toString()
            var Credit2 = Credit2.text.toString()
            var Point2 = Point2.text.toString()

            var BusinessLaw = BusinessLaw.text.toString()
            var Credit3 = Credit3.text.toString()
            var Point3  = Point3 .text.toString()

            var InformationSystem = InformationSystem.text.toString()
            var Credit4 = Credit4.text.toString()
            var Point4 = Point4 .text.toString()

            var Opensoure = Opensoure.text.toString()
            var Credit5 = Credit5.text.toString()
            var Point5  = Point5 .text.toString()

            if (ComputerNetwork == "" || Credit1 == ""|| Point1 == ""|| Badminton == "" || Credit2 == ""|| Point2 == ""|| BusinessLaw == "" || Credit3 == ""|| Point3 == ""
                || InformationSystem == "" || Credit4 == ""|| Point4 == ""|| Opensoure == "" || Credit5 == ""|| Point5 == "") {
                Toast.makeText(
                    applicationContext,
                    "กรุณากรอกข้อมูล",
                    Toast.LENGTH_SHORT
                ).show()

                Toast.makeText(
                    applicationContext,
                    "กรุณากรอกข้อมูล",
                    Toast.LENGTH_SHORT
                ).show()
            } else{
                var sumcredit = Credit1.toInt() + Credit2.toInt() + Credit3.toInt() + Credit4.toInt() + Credit5.toInt()
                run.setText("$sumcredit")
                var cxd1 = Credit1.toDouble() * Point1.toDouble()
                var cxd2 = Credit2.toDouble() * Point2.toDouble()
                var cxd3 = Credit3.toDouble() * Point3.toDouble()
                var cxd4 = Credit4.toDouble() * Point4.toDouble()
                var cxd5 = Credit5.toDouble() * Point5.toDouble()
                var sumcxd = cxd1 + cxd2 + cxd3 + cxd4 + cxd5
                var grade = sumcxd / sumcredit
                val ss = String.format("%.2f",grade)
                runn.setText(ss)

            }
        }
        Cancel.setOnClickListener {
            Credit1.setText("")
            Point1.setText("")

            Credit2.setText("")
            Point2.setText("")

            Credit3.setText("")
            Point3.setText("")

            Credit4.setText("")
            Point4.setText("")

            Credit5.setText("")
            Point5.setText("")

            run.setText("")
            runn.setText("")

        }

    }
}