package com.dicoding.skinalyze.ui.userprofile

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import com.dicoding.skinalyze.R

class UserFragment : Fragment() {

    companion object {
        fun newInstance() = UserFragment()
    }

    private val viewModel: UserViewModel by viewModels()

    private lateinit var profileImage: ImageView
    private lateinit var profileName: TextView
    private lateinit var profileEmail: TextView
    private lateinit var cardEditProfile: CardView
    private lateinit var cardChangePassword: CardView
    private lateinit var cardSettings: CardView
    private lateinit var cardLogout: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // TODO: Use the ViewModel
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_user, container, false)

        // Bind Views
        profileImage = view.findViewById(R.id.profile_image)
        profileName = view.findViewById(R.id.profile_name)
        profileEmail = view.findViewById(R.id.profile_email)
        cardEditProfile = view.findViewById(R.id.card_edit_profile)
        cardChangePassword = view.findViewById(R.id.card_change_password)
        cardSettings = view.findViewById(R.id.card_settings)
        cardLogout = view.findViewById(R.id.card_logout)

        // Dummy Data, replace with real user data
        val userName = "Sultan Abdul"
        val userEmail = "abdulsultan@gmail.com"
        val userProfileImage = R.drawable.ic_profile_placeholder

        // Set Data to Views
        profileName.text = userName
        profileEmail.text = userEmail
        profileImage.setImageResource(userProfileImage)

        // Set Click Listeners for Cards
        cardEditProfile.setOnClickListener {
            Toast.makeText(requireContext(), "Edit Profile clicked", Toast.LENGTH_SHORT).show()
            // TODO: Add navigation or action for edit profile
        }

        cardChangePassword.setOnClickListener {
            Toast.makeText(requireContext(), "Change Password clicked", Toast.LENGTH_SHORT).show()
            // TODO: Add navigation or action for change password
        }

        cardSettings.setOnClickListener {
            Toast.makeText(requireContext(), "Settings clicked", Toast.LENGTH_SHORT).show()
            // TODO: Add navigation or action for settings
        }

        cardLogout.setOnClickListener {
            Toast.makeText(requireContext(), "Log Out clicked", Toast.LENGTH_SHORT).show()
            // TODO: Add log out functionality
        }

        return view
    }
}
