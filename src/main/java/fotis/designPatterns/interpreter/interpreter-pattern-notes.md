# Interpreter Pattern

### Intent

1. Given a language, define a representation for its grammar along with an interpreter that uses the representation to interpret sentences in the language.
1. n computer programming, the interpreter pattern is a design pattern that specifies how to evaluate sentences in a language. The basic idea is to have a class for each symbol (terminal or nonterminal) in a specialized computer language. The syntax tree of a sentence in the language is an instance of the composite pattern and is used to evaluate (interpret) the sentence for a client.

### Design Considerations

1. Interface - Abstract class -> define the Interpret operation.
1. Each Rule becomes an expression. Expression which do not need other expressions become terminal expressions.
1. Non terminal expressions call interpret of terminal and non terminal expressions.

### Applicability

Use the Interpreter pattern when there is a language to interpret, and you can represent statements in the language as abstract syntax trees. The Interpreter pattern works best when:

1. The grammar is simple. For complex grammars, the class hierarchy for the grammar becomes large and unmanageable. Tools such as parser generators are a better alternative in such cases. They can interpret expressions without building abstract syntax trees, which can save space and possibly time
1. Efficiency is not a critical concern. The most efficient interpreters are usually not implemented by interpreting parse trees directly but by first translating them into another form. For example, regular expressions are often transformed into state machines. But even then, the translator can be implemented by the Interpreter pattern, so the pattern is still applicable

ex. java.util.Pattern, java.text.Format

### Consequences

1. Can be very complex if the grammar is complex.
1. 1 Class per rule - may result in a large number of classes.
1. Very specific to a particular kind of problem.
