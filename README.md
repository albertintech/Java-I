# Java I

Repo created for a Java I course

A lesson learned about file stucture appearance in VSCode and on GitHub:

If you have nested folders in your project, VSCode and GitHub will will display them
"in-line" like so:

- 📁 folder1/nested_folder

I would prefer to see this:

<ul>
<li>📁 folder
  <ul>
    <li>📁 nested_folder
      <ul>
        <li>📁 another_nested_folder</li>
      </ul>
    </li>
  </ul>
  </li>
</ul>

This is not really a big deal, unless you have a list of folders with only one
sticking out like a sore thumb:

- 📁 folder1
- 📁 folder2
- 📁 folder3/nested_folder
- 📁 folder4
- 📁 folder5

Grrrr! Houston, we have a problem!

After much gnashing of persnickety teeth, the answer is simple: make sure the
nested folder is not the only object in the root folder!

Taking the above example, we can just add an "invisible" empty .gitkeep file,
or any other type of file or another folder, to correct the abberation:

- 📁 folder3
  - 📄 .gitkeep
  - 📁 nested_folder

Now your folders will look nice and tidy from the repository level:

- 📁 folder1
- 📁 folder2
- 📁 folder3
- 📁 folder4
- 📁 folder5

Hope this helps! Bye for now! 👋🏼
