# Contributing to [Project Name]

Thank you for your interest in contributing to [Project Name]! We appreciate your help in making this project better.

## Commit Guidelines

### Sign-off

All commits must be signed off. Use the `--signoff` or `-s` flag when committing:


git commit -s -m "Your commit message"

### Conventional Commits

We use the Conventional Commits specification for commit messages. Please format your commit messages as follows:

```
<type>[optional scope]: <description>

[optional body]

[optional footer(s)]
```

Types include:
- feat: A new feature
- fix: A bug fix
- docs: Documentation changes
- style: Code style changes (formatting, semicolons, etc)
- refactor: Code changes that neither fix a bug nor add a feature
- perf: Performance improvements
- test: Adding or modifying tests
- chore: Changes to build process or auxiliary tools

Example:

```
feat(auth): add login functionality

Implement user authentication using JWT tokens.

Closes #123
```

## Pull Request Process

1. Fork the repository and create your branch from `main`.
2. Ensure your code adheres to the project's coding standards.
3. Include tests for new features or bug fixes.
4. Update documentation as necessary.
5. Submit a pull request with a clear title and description.
6. Make sure that your pull request closes an issue, if there isn't one already, feel free to open one.

Thank you for your contributions!