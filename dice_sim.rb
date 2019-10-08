def d6
  return rand(1...7)
end

total = 0
success = 0
for i in 1...1000
  roll = d6
  if roll != 6
    count+= 1
  else
    count+=1
    if(i%200 == 0)
      total = total+count
      success += 1
    end
    count = 0
  end
end

average = total/success
print average



