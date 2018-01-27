package io.mainflux.loadmanager

import org.scalatest.concurrent.Eventually
import org.scalatest.mockito.MockitoSugar
import org.scalatest.{BeforeAndAfterAll, FlatSpecLike, Matchers}

trait UnitSpec extends FlatSpecLike with Matchers with MockitoSugar with BeforeAndAfterAll with Eventually {}
