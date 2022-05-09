# Java I

Repo created for a Java I course

Two lessons learned about file stucture in VSCode and on GitHub:

If you have nested folders in your project, VSCode will will display them
"in-line" like so:

- folder1/folder2/folder3

I would prefer to see this:

- folder1
  -folder2
  -folder3

In order to see folders in a cascading stucture, do the following:

- Preferences > Settings > search 'folder' > Explorer: Compact Folders
- Uncheck the box for Explorer: Compact Folders

This will only affect how nested folders look in VSCode.

Your folder stucture on GitHub may still appear in-line.

This is not really a big deal, unless you have a bunch of folders, some nested,
but none of them displaying in-line except for one sticking out like a sore thumb
like so:

folder1
folder2
folder3/nested
folder4

Grrrr! Houston, we have a problem!

After much gnashing of persnickety teeth, the answer is simple: make sure the
first nested folder is not the only thing the root folder!

Taking the above example, we can just add an "invisible" empty .gitkeep file
to correct the abberation:

folder3
-.gitkeep
-nested

Now your folders will look nice and tidy:

folder1
folder2
folder3
folder4

Hope this helps! Bye for now!
