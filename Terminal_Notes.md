####1. Delete a folder (not empty)
`rmdir -rf `   + "directory"

FYI: you can use letters -f, -r, -v:

-r: to remove directories and their contents recursively
-f: to ignore non-existent files, never prompt
-v: to explain what is being done

In Case *User doesnot have permission to delete the folder:*

`su rmdir -rf`



####2. Terminate and Clear
`Ctrl + C` to terminate a process
`Command + k` to clear the screen



####3. Show Hidden Files and Hide Hidden Files
defaults write com.apple.finder AppleShowAllFiles YES
Press `Option` and Write 

####4. Open a file with a specific Application
eg:`$ open -a "Sublime Text" id_rsa` 



####5. Logout the super user and go back to your account.
`exit`


####6. Change the owner of a file system object (files and directories).
`sudo chown -R $USER /usr/local`




####7. Logout the super user and go back to your account.
`sudo mv fromPath/ toPath/`
eg:`sudo mv /Users/apple/DynamicPrograme /Users/apple/Coding/ `