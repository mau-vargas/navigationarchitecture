package architecture.navigation.com.navigationarchitecture


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_main.button
import kotlinx.android.synthetic.main.fragment_main.button2


class MainFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.oneFragment, null))


        button2.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.twoFragment, null))

    }
}
