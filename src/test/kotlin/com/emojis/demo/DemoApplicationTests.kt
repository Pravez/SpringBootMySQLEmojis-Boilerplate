package com.emojis.demo

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private lateinit var repository: PostRepository

	@Test
	fun `add some emojis`() {
		val post = Post("I'm a poop \uD83D\uDCA9", "You know, being a \uD83D\uDCA9 isn't always easy. Especially when you eat \uD83C\uDF2E.")
		val saved = repository.saveAndFlush(post)

		val storedPost = repository.getOne(saved.id)

		assert(post.title == storedPost.title)
		assert(post.content == storedPost.content)
	}
}
