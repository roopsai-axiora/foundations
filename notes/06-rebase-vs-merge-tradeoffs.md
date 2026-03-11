# Rebase vs Merge Trade-offs

## merge
- Keeps original branch history
- Adds merge commit
- Safest for shared branches

## rebase
- Rewrites commit SHAs
- Produces linear history
- Great for local branch cleanup

## Practical rule
- Shared/public branch -> merge
- Private/local feature branch -> rebase
