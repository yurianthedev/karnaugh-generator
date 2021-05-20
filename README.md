# Karnaugh Generator

This is a basic implementation that parse a 3rd grade boolean expression, resolve it and draw a **Karnaugh Map** from
that.

The drawing uses [asciitable](https://github.com/vdmeer/asciitable) for this purpose.

## Example

```
Please enter an expression (e.g. AB'+BC): AC+AB'
┌───────────────┬───────────────┬───────────────┬───────────────┬──────────────┐
│C\AB           │00             │01             │11             │10            │
├───────────────┼───────────────┼───────────────┼───────────────┼──────────────┤
│0              │0              │0              │0              │1             │
├───────────────┼───────────────┼───────────────┼───────────────┼──────────────┤
│1              │0              │0              │1              │1             │
└───────────────┴───────────────┴───────────────┴───────────────┴──────────────┘
```

## Contribute

Contributions about how to this work with more complex expressions and ones of more degree are absolutely welcome.
