package com.minicup.launchmode


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.minicup.launchmode.single_task.SingleTaskAActivity
import com.minicup.launchmode.single_task.SingleTaskBActivity
import com.minicup.launchmode.single_top.SingleTopAActivity
import com.minicup.launchmode.single_top.SingleTopBActivity

import com.minicup.launchmode.stantard.StandardAActivity
import com.minicup.launchmode.stantard.StandardBActivity
import com.minicup.launchmode.stantard.StandardCActivity
import com.minicup.launchmode.stantard.StandardDActivity
import kotlinx.android.synthetic.main.fragment_standard.*
import org.jetbrains.anko.clearTask
import org.jetbrains.anko.clearTop
import org.jetbrains.anko.newTask
import org.jetbrains.anko.singleTop
import org.jetbrains.anko.support.v4.intentFor

/**
 * A simple [Fragment] subclass.
 */
class StandardFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_standard, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        a.setOnClickListener {
            startActivity(intentFor<StandardAActivity>())
        }
        b.setOnClickListener {
            startActivity(intentFor<StandardBActivity>())
        }
        c.setOnClickListener {
            startActivity(intentFor<StandardCActivity>())
        }
        d.setOnClickListener {
            startActivity(intentFor<StandardDActivity>())


            //相当于xml中配置singleTop, 如果DActivity在栈顶，不再创建另一个实例，而是调用原来实例的onNewIntent()
            //没有页面切换效果
//            startActivity(intentFor<StandardDActivity>().singleTop())


            //与Standard没有有区别，这个应与其他Flag配合使用,每次调用onCreate()创建实例
            //和Standard一样有页面切换效果
//            startActivity(intentFor<StandardDActivity>().newTask())


            //栈中如果有DActivity，删除该Activity及其上面的所有Activity，然后创建实例并放到栈顶，每次调用onCreate()创建实例
            //栈中如果没有DActivity， 首次创建实例有切换效果，再次创建实例没有切换效果
//            startActivity(intentFor<StandardDActivity>().clearTop())

            //栈中如果有DActivity，删除该Activity及其上面的所有Activity，然后创建实例并放到栈顶，每次调用onCreate()创建实例
            //一直会有切换效果
//            startActivity(intentFor<StandardDActivity>().newTask().clearTop())


//            startActivity(intentFor<StandardDActivity>().singleTop().clearTop())

        }
        topA.setOnClickListener {
            startActivity(intentFor<SingleTopAActivity>())
        }

        topB.setOnClickListener {
            startActivity(intentFor<SingleTopBActivity>())
        }
        taskA.setOnClickListener {
            startActivity(intentFor<SingleTaskAActivity>())
        }
        taskB.setOnClickListener {
            startActivity(intentFor<SingleTaskBActivity>())
        }

        finish.setOnClickListener { activity?.finishAffinity() }
    }
}
