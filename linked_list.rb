  class Node
  #instance members for prev and next node
  @next_node = nil
  #empty constructor
  def initialize()
    @node_data = nil
  end
  #constructor with initial data
  def initialize(data)
    @node_data = data
  end
  #set the next node link
  def set_next(node)
    @next_node = node
  end
  #return the next node
  def get_next()
    return @next_node
  end
  #return true if linked to next node; else false
  def has_next?()
    if @next_node
      return true
    else
      return false
    end
  end
  #getter method for retrieving node data
  def get_node_data()
    return @node_data
  end
  #toString method for node
  def print()
    puts @node_data.to_s
  end
end

class DoublyLinkedList
  #empty constructor
  def initialize()
    @root_node = nil
  end
  #constructor with input
  def initialize(node)
    @root_node = node
  end
  #insert node at tail
  def insert_tail(node)
    current_node = @root_node
    while current_node.has_next?()
      current_node = current_node.get_next()
    end
    current_node.set_next(node)
  end
  #insert node at head
  def insert_head(node)
    if @root_node.nil?
      @root_node = node
    else
      node.set_next(@root_node)
      @root_node = node
    end
    current_node = @root_node.get_next()
    while current_node
      current_node = current_node.get_next()
    end
  end
  #deletes node by value
  def delete_node(node_value)
    current_node = @root_node
    if current_node.get_node_data() == node_value
      @root_node = @root_node.get_next()
      current_node = nil
    else
      while current_node.has_next?()
        current_node = current_node.get_next()
        if current_node.get_node_data() == node_value
          current_node.get_prev().set_next(current_node.get_next())
          current_node.get_next().set_prev(current_node.get_prev())
          return
        end
      end
    end
  end
  #toString method
  def print()
    current_node = @root_node
    while current_node != nil
      current_node.print()
      current_node = current_node.get_next()
    end
  end
end

#methods in case nil is returned instead of node
def nil.set_prev(node)
end
def nil.set_next(node)
end