package com.lambdaschool.choretracker

import androidx.lifecycle.LiveData
import com.lambdaschool.choretracker.model.Child
import com.lambdaschool.choretracker.model.Chore
import com.lambdaschool.choretracker.model.CredentialsAPI

interface DatabaseRepoInterface {

    // Chore table
    fun createChore(chore: Chore)
    fun getAllChoresForParentId(parentId: Int): LiveData<List<Chore>>
    fun getAllChoresForChildId(childId: Int): LiveData<List<Chore>>
    fun getAllChoresForParentIdExceptChildId(parentId: Int, childId: Int): LiveData<List<Chore>>
    fun updateChore(chore: Chore)
    fun deleteChore(chore: Chore)

    // Child table
    fun createChild(child: Child)
    fun getAllChildForParentId(parentId: Int): LiveData<List<Child>>
    fun updateChild(child: Child)
    fun deleteChild(child: Child)

    // ChoreTrackerAPI
    fun registerUser(creds: CredentialsAPI): LiveData<Boolean>
    fun loginUser(creds: CredentialsAPI): LiveData<Boolean>
}