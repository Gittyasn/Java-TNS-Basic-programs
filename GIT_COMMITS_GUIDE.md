# Git Commands: From Project to GitHub

## First-time setup for a project

Create a new **empty** repository on GitHub first. Then open a terminal in your project folder and run these commands one by one:

```powershell
git init
git add .
git status
git commit -m "First project commit"
git branch -M main
git remote add origin https://github.com/USERNAME/REPOSITORY.git
git push -u origin main
```

Replace `USERNAME` and `REPOSITORY` with your GitHub username and repository name. For example, if your username is `alex` and the repository is `java-practice`, the remote command is:

```powershell
git remote add origin https://github.com/alex/java-practice.git
```

`git status` lets you check which files are about to be committed. Review the list before continuing. `git add .` includes new files, edits, and deletions.

## For your next changes

After the project is connected, use these commands whenever you want to save and upload more changes:

```powershell
git status
git add .
git status
git commit -m "Describe your change"
git push
```

Example:

```powershell
git add .
git commit -m "Add array exception example"
git push
```

## What the commands mean

- `git init` — Start tracking this folder with Git.
- `git add .` — Select all changes in this folder for the next commit.
- `git status` — Show changed, staged, and untracked files.
- `git commit -m "message"` — Save the selected changes in your local Git history.
- `git branch -M main` — Name the current branch `main`.
- `git remote add origin URL` — Connect the local project to its GitHub repository.
- `git push -u origin main` — Upload the first commit and set GitHub as the default destination.
- `git push` — Upload later commits.

## If the project is already connected

If you cloned the project from GitHub or already use it with Git, **do not run `git init` or `git remote add origin` again**. Go into the project folder and use the “For your next changes” commands.

To check the GitHub connection:

```powershell
git remote -v
```
