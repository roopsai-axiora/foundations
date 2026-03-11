# Rebase vs Merge

## Merge
- Combines histories
- Preserves branch structure
- Safe for shared branches

## Rebase
- Replays commits on top of target branch
- Creates linear history
- Rewrites commit hashes

## Rule of thumb
- Shared branch -> prefer merge
- Local feature cleanup -> rebase
