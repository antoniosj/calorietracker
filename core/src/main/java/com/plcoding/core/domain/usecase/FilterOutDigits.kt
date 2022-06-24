package com.plcoding.core.domain.usecase

/* as we don't have business logic in our presentation layer + viewmodel
 * we can create this UseCase class.
 *
 * operator fun invoke will be called when we call this class passing the value in
 * the constructor like this: FilterOutDigits("value")
 */
class FilterOutDigits {
    operator fun invoke(text: String): String {
        return text.filter { it.isDigit() }
    }
}