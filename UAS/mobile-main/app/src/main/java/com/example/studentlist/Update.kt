package com.example.studentlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_update.*

class Update : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_update)
        val dataHelper = DataHelper(this)
        save_update.setOnClickListener {
            val alertDialogBuilder = AlertDialog.Builder(this)
            alertDialogBuilder.setTitle("Konfirmasi")
                .setMessage("Yakin mau update ?")
                .setCancelable(true)
                .setPositiveButton("No") { dialog, which ->
                }
                .setNegativeButton("Yes") { dialog, which ->
                    val nim = Integer.parseInt(et_nim2.text.toString())
                    val name = et_name2.text.toString()
                    val ipk = et_ipk2.text.toString()
                    val faculty = et_faculty2.text.toString()

//                    dataHelper.updateStudent(Student(nim, name, ipk, faculty))
                    //                  et_nim2.setText("")
                    //                et_name2.setText("")
                    //              et_ipk2.setText("")
                    //            et_faculty2.setText("")
                    //        }
                    //   val alertDialog = alertDialogBuilder.create()
                    //    alertDialog.show()
                    //  }

                    /*
        val dataHelper = DataHelper(this)
        b_insert.setOnClickListener{
            val alertDialogBuilder = AlertDialog.Builder(this)
            alertDialogBuilder.setTitle("Konfirmasi")
                .setMessage("Are you sure to insert it?")
                .setCancelable(true)
                .setPositiveButton("No"){dialog,which->
                }
                .setNegativeButton("Yes"){dialog,which->
                    val nim = Integer.parseInt(et_nim.text.toString())
                    val name = et_name.text.toString()
                    val ipk = et_ipk.text.toString()
                    val faculty = et_faculty.text.toString()

                    dataHelper.addStudent(Student(nim,name,ipk,faculty))
                    et_name.setText("")
                    et_nim.setText("")
                    et_ipk.setText("")
                    et_faculty.setText("")
                }
            val alertDialog = alertDialogBuilder.create()
            alertDialog.show()
        }
        */
                }
        }
    }